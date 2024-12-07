package dev.ed.game.game.service;

import dev.ed.game.game.domain.Company;

import java.util.List;

public interface CompanyService {

    /**
     * return companies information
     * @return
     */
    List<Company> getCompanies();

    /**
     * save company information
     * @param company
     */
    void saveCompany(Company company);

    /**
     * delete company by companyId
     * @param companyId
     */
    void deleteCompanyById(Integer companyId);

    /**
     * update name by companyId
     * @param companyId
     * @param name
     */
    void updateCompanyById(Integer companyId, String name);
}
