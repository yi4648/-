package com.zut.manager.controller;

import java.util.Arrays;
import java.util.Map;


import com.zut.manager.common.utils.PageUtils;
import com.zut.manager.common.utils.R;
import com.zut.manager.entity.BookEntity;
import com.zut.manager.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import springfox.documentation.annotations.ApiIgnore;


/**
 * 
 *
 * @author liqiqi
 * @email 523892377@qq.com
 * @date 2020-12-10 19:51:11
 */
@RestController
@RequestMapping("manager/book")
@Api(tags = "图书接口")
@CrossOrigin
public class BookController {
    @Autowired
    private BookService bookService;

    /**
     * 列表
     */
    @ApiOperation("查询接口")
    @ApiImplicitParams({@ApiImplicitParam(name = "bookName",value = "书名",required = false,paramType = "query"),
            @ApiImplicitParam(name = "bookPub",value = "出版社",required = false,paramType = "query"),
            @ApiImplicitParam(name = "page",value = "当前页",required = false,defaultValue = "1",paramType = "query"),
            @ApiImplicitParam(name = "limit",value = "一页多少条",type = "int",required = false,defaultValue = "10",paramType = "query")})
    @GetMapping("/list")
    public R list(@ApiIgnore @RequestParam Map<String, Object> params){
        PageUtils page = bookService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation("根据id查询接口")
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		BookEntity book = bookService.getById(id);

        return R.ok().put("book", book);
    }

    /**
     * 保存
     */
    @ApiOperation("保存图书信息")
    @PostMapping("/save")
    public R save(@RequestBody BookEntity book){
		bookService.save(book);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation("更新图书信息")
    @PostMapping("/update")
    public R update(@RequestBody BookEntity book){
		bookService.updateById(book);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation("删除图书信息")
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Integer id){
		bookService.removeById(id);

        return R.ok();
    }

}
