package com.itheima.ssm.controller;

import cao.itheima.ssm.domain.Product;
import com.itheima.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/heima_ssm_web/product")
public class ProductController {

    @Autowired
    private IProductService productService;
//查询全部产品
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> ps = productService.findAll();
        mv.addObject("productList", ps);
        System.out.println("进入web1");
        mv.setViewName("/product-list.jsp");
        System.out.println("进入web2");
        return mv;

    }
}
