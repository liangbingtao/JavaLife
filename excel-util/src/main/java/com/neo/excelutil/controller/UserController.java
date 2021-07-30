package com.neo.excelutil.controller;

import com.neo.excelutil.entity.User;
import com.neo.excelutil.service.UserService;
import com.neo.excelutil.utils.ExcelUtil;
import com.neo.excelutil.utils.ExcelUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;


/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2021-07-30 18:39:48
 */

@Controller
public class UserController {

    /**
     * 服务对象
     */

    @Resource
    private UserService userService;


    @GetMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */

    @GetMapping("selectOne/{id}")
    public User selectOne(@PathVariable("id") Integer id) {
        return this.userService.queryById(id);
    }


    /*导入使用方法：
    //文件输入流
    inputStream =uploadedFile.getInputStream();
    //获取对象集合
    List< SlrEmpSalary> empSalaryList =
            (List< SlrEmpSalary>) ExcelUtils.parseExcelToList(inputStream,  SlrEmpSalary.class);

    导出使用方法：
    //导出数据
    List< SlrEmpSalary> dataList = new ArrayList<SlrEmpSalary>();
    //导出
     FileUtils.exportExcel(outputStream, dataList,  SlrEmpSalary.class, Const.ALL_SELECT_LIST_MAP, exportTitle);
*/


    @PostMapping("/impFile")
    public String upload(@RequestParam(value = "file") MultipartFile uploadedFile, Model model) throws IOException, InvocationTargetException, NoSuchMethodException, InvalidFormatException, InstantiationException, IllegalAccessException {

        if (uploadedFile.isEmpty()) {
            return "redirect:/";
        }
        //文件输入流
        InputStream inputStream = uploadedFile.getInputStream();
        //获取对象集合
        List<User> userList =
                (List<User>) ExcelUtils.parseExcelToList(inputStream, User.class);
        model.addAttribute("userList", userList);
        return "record";
    }

    @GetMapping("/exportFile")
    public void export(HttpServletResponse response) throws IOException {
        List<User> userList = userService.queryAllByLimit(0, 100);
        OutputStream outputStream = response.getOutputStream();
        // ExcelUtil.exportExcel(userList,"title","sheetname", User.class,"新闻数据表.xls", response);
        ExcelUtils.exportExcel(outputStream, userList, User.class, null, "输出.xls");

    }

}


