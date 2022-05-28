package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface CourseContentService {
    /**
     * 根据课程Id查询对应的课程内容
     * */

    List<CourseSection> findSectionAndLessonByCourseId(int courseId);

    Course findCourseByCourseId(int courseId);

    void saveSection(CourseSection section);

    void updateSection(CourseSection section);
    /*
    修改章节状态
     */
    void updateSectionStatus(int id,int status);



}
