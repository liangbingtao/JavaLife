package com.neo.controller;


import com.neo.entity.User;
import com.neo.service.UserService;
import com.neo.vo.DataVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2021-07-27 10:56:14
 */
@Controller
public class UserController {

    @GetMapping("/")
    public String index(Integer page, Integer size, Model model) {
        model.addAttribute("page", page);
        model.addAttribute("size", size);
        return "table";
    }

    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    // @GetMapping("/selectAll/{page}/{size}")
    @GetMapping("/selectAll")
    @ResponseBody
    public DataVo<User> selectAll(@RequestParam(value = "page") Integer page,
                                  @RequestParam(value = "limit") Integer size) {

        List<User> users = userService.queryAllByLimit(page, size);
        Integer recordNum = userService.getRecordNum();
        if (users.size() > 0) {
            return DataVo.success(recordNum, users);
        } else {
            return DataVo.failed();
        }
    }

    @PostMapping("/delete/{id}")
    public DataVo delete(@PathVariable("id") Integer id) {
        userService.deleteById(id);
        return DataVo.success(1, null);
    }

}