package com.lagou.controller;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;
import com.lagou.domain.ResponseResult;
import com.lagou.service.CourseContentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 张岩
 * @version 1.0
 */
@RestController
@RequestMapping("/courseContent")
public class CourseContentController {
    @Autowired
    private CourseContentService courseContentService;

    /**
     * 查询课程内容
     */
    @RequestMapping("/findSectionAndLesson")
    public ResponseResult findSectionAndLessonByCourseId(@RequestParam int courseId) {
        try {
            //调用service
            List<CourseSection> sectionList = courseContentService.findSectionAndLessonByCourseId(courseId);
            //封装数据并返回
            ResponseResult result = new ResponseResult(true, 200, "查询成功", sectionList);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 回显章节对应的课程信息
     */
    @RequestMapping("/findCourseByCourseId")
    public ResponseResult findCourseByCourseId(@RequestParam int courseId) {

        try {
            Course courseByCourseId = courseContentService.findCourseByCourseId(courseId);

            ResponseResult responseResult = new ResponseResult(true, 200, "查询成功", courseByCourseId);

            return responseResult;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }
    /**
     * 保存&修改章节信息
     */
    @RequestMapping("/saveOrUpdateSection")
    public ResponseResult saveOrUpdateSection(@RequestBody CourseSection section) {
        try {
            //判断携带id是修改操作否则是插入操作
            if (section.getId() == null) {
                courseContentService.saveSection(section);
                return new ResponseResult(true, 200, "修改成功", null);
            } else {
                courseContentService.updateSection(section);
                return new ResponseResult(true, 200, "插入成功", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 修改章节状态
     * 状态，0:隐藏；1：待更新；2：已发布
     * */
    @RequestMapping("/updateSectionStatus")
    public ResponseResult updateSectionStatus(@RequestParam int id,@RequestParam int status){
        try {
            courseContentService.updateSectionStatus(id,status);
            //封装最新的状态信息
            Map<String,Integer> map = new HashMap<>();
            map.put("status",status);
            ResponseResult result = new ResponseResult(true,200,"修改成功",map);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



}
