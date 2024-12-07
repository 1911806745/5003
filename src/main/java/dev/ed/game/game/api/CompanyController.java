package dev.ed.game.game.api;

import dev.ed.game.game.domain.Company;
import dev.ed.game.game.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/v1/company")
public class CompanyController {

    @Resource
    private CompanyService companyService;

    @GetMapping
    public List<Company> getCompanies() {
        return companyService.getCompanies();
    }

    @PostMapping
    public void saveCompany(@RequestBody Company company) {
        companyService.saveCompany(company);
    }

    @DeleteMapping(path = "{companyId}")
    public void deleteCompanyById(@PathVariable Integer companyId) {
        companyService.deleteCompanyById(companyId);
    }

    @PutMapping(path = "{companyId}")
    public void updateCompanyNameById(@PathVariable Integer companyId,
                                  @RequestParam String name) {
        companyService.updateCompanyById(companyId, name);
    }
}
