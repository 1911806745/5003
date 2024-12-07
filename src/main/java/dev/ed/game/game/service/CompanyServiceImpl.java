package dev.ed.game.game.service;

import cn.hutool.core.collection.ListUtil;
import dev.ed.game.game.dal.CompanyMapper;
import dev.ed.game.game.domain.Company;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
public class CompanyServiceImpl implements CompanyService{
    @Resource
    private CompanyMapper companyMapper;

    @Override
    public List<Company> getCompanies() {
        return companyMapper.selectList(null);
    }

    @Override
    public void saveCompany(Company company) {
        Company select = companyMapper.selectById(company.getCompanyId());
        if(select != null) {
            throw new IllegalStateException("This company has already existed.");
        }
        companyMapper.insert(company);
    }

    @Override
    public void deleteCompanyById(Integer companyId) {
        Company select = companyMapper.selectById(companyId);
        if(select == null) {
            throw new IllegalStateException("This company has not existed.");
        }
        companyMapper.deleteById(companyId);
    }

    @Override
    @Transactional
    public void updateCompanyById(Integer companyId, String name) {
        Company select = companyMapper.selectById(companyId);
        if(select == null) {
            throw new IllegalStateException("This company has not existed");
        }
        if(name != null && !name.isEmpty() && !Objects.equals(name, select.getName())) {
            select.setName(name);
        }
        companyMapper.updateById(select);
    }
}
