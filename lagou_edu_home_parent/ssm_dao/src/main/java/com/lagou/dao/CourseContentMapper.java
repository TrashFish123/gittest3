package com.lagou.dao;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;

import java.util.List;

/**
 * @author 张岩
 * @version 1.0
 */
public interface CourseContentMapper {

    /**
     * 查询课程下的章节与课时信息
     */

    List<CourseSection> findSectionAndLessonByCourseId(int courseId);

    /**
     * 回显章节对应的课程信息
     * */
    Course findCourseByCourseId(int courseId);


    /**
     * 保存章节
     * */
    void saveSection(CourseSection section);

    /**
     * 修改章节
     * */
    void updateSection(CourseSection section);
    /**
     * 修改章节状态
     * */
    void updateSectionStatus(CourseSection section);


}
