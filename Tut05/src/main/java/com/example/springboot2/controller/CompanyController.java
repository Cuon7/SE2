package com.example.springboot2.controller;

import com.example.springboot2.model.Company;
import com.example.springboot2.model.Employee;
import com.example.springboot2.repository.CompanyRepository;
import com.example.springboot2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(value = "/list")
    public String getAllCompany(Model model) {
        List<Company> companies = companyRepository.findAll();
        model.addAttribute("companies", companies);
        return "companyList";
    }

    @RequestMapping(value = "details/{id}")
    public String getCompanyById(@PathVariable(value = "id") Long id, Model model) {
        Company company = companyRepository.getById(id);
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        model.addAttribute("company", company);
        return "companyDetail";
    }

    @RequestMapping(value = "/add")
    public String addCompany (Model model) {
        Company company = new Company();
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("company", company);
        model.addAttribute("employees", employees);
        return "companyAdd";
    }

    @RequestMapping (value = "/update/{id}")
    public String updateCompany(
            @PathVariable (value = "id") Long id, Model model)  {
        Company company = companyRepository.getById(id);
        model.addAttribute(company);
        return "companyUpdate";
    }

    @RequestMapping(value = "/save")
    public String saveUpdate(
            @RequestParam(value = "id", required = false) Long id, @Valid Company company, BindingResult result)
    {
        if (result.hasErrors()) {
            if (id == null) {
                return "companyAdd";
            } else {
                return "companyUpdate";
            }
        }
        company.setId(id);
        companyRepository.save(company);
        return "redirect:/company/list";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteCompany(
            @PathVariable(value = "id") Long id) {
        Company company = companyRepository.getById(id);
        companyRepository.delete(company);
        return "redirect:/company/list";
    }

    @RequestMapping("/search")
    public String searchCompany(Model model, @RequestParam(value = "name") String name) {
        List<Company> companies = companyRepository.findByNameContaining(name);
        model.addAttribute("companies", companies);
        return "companyList";
    }

    @RequestMapping("/sort/asc")
    public String sortCompanyAsc(Model model) {
        List<Company> companies = companyRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
        model.addAttribute("companies", companies);
        return "companyList";
    }

    @RequestMapping("/sort/desc")
    public String sortCompanyDesc(Model model) {
        List<Company> companies = companyRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
        model.addAttribute("companies", companies);
        return "companyList";
    }

}
