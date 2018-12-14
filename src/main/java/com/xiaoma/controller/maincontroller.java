package com.xiaoma.controller;


import com.xiaoma.Util.JsonUtil;
import com.xiaoma.dao.NewsDao;
import com.xiaoma.dao.UsersDao;
import com.xiaoma.entity.NEWS;
import com.xiaoma.entity.USERS;
import com.xiaoma.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("main")

public class maincontroller {
    @Autowired
    private UsersDao dao;
    @Autowired
    private NewsDao newsDao;
    @RequestMapping("index")
    public String index(Model model) throws IOException {

//          实现批量插入数据
//          JsonUtil jsonUtil=new JsonUtil();
//          List<NEWS>newsList=new ArrayList<NEWS>();
//          newsList=jsonUtil.getPath();
//          newsDao.insertByBatch(newsList);

        //新闻资料
        List<NEWS>newsList=newsDao.findall();
        System.out.println(newsList);
        model.addAttribute("newsList",newsList);






          return "index";
    }
    @RequestMapping("about")
    public String about() {
        return "about";
    }
    @RequestMapping("blog")
    public String blog() {
        return "blog";
    }
    @RequestMapping("service")
    public String service() {
        return "service";
    }

    @RequestMapping("page")
    public String page() {
        return "page";
    }
    @RequestMapping("contact")
    public String contact() {
        return "contact";
    }

}
