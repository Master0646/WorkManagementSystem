package team.work.core.service.impl;

import com.alibaba.fastjson.JSONObject;
import team.work.core.mapper.CourseMapper;
import team.work.core.model.Course;
import team.work.core.service.ICourseService;
import team.work.utils.base.TServiceImpl;
import team.work.utils.bean.Page;
import team.work.utils.convert.F;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import team.work.utils.convert.W;
import team.work.utils.bean.Where;
@Service
public class CourseService extends TServiceImpl<CourseMapper,Course> implements ICourseService {
   /**************************CURD begin******************************/ 
   // 创建
   @Override
   public Course createCourse(Course model) {
       if(this.insert(model))
           return this.selectById(model.getId());
       return null;
   }
 
   // 删除
   @Override
   public Boolean deleteCourse(Object ids,String reviser) {
       return this.delete(ids,reviser);
   }
 
   // 修改
   @Override
   public Course updateCourse(Course model) {
       if(this.update(model))
           return this.selectById(model.getId());
       return null;
   }
 
   // 查询
   @Override
   public List<Course> findByIds(Object ids) {
       return this.selectByIds(ids);
   }
 
   // 属于
   @Override
   public Boolean exist(List<Where> w) {
       w.add(new Where("1"));
       return this.query(w).size() > 0;
   }
 
   // 查询一个id是否存在
   @Override
   public Boolean existId(Object id) {
       where = W.f(
               W.and("id","eq",id),
               W.field("1")
       );
       return this.query(where).size() > 0;
   }
 
   /**************************CURD end********************************/ 
    //分页查
    public Page page(int index, int pageSize, String w) {
        // 总记录数
        JSONObject row = baseMapper.getPageCount(w);
        int totalCount = row.getInteger("total");
        if(totalCount == 0)
            return new Page(new ArrayList<JSONObject>(),pageSize,0,0,1);
        // 分页数据
        index = index < 0 ? 1:index;
        int limit = (index - 1) * pageSize;
        int totalPage = totalCount % pageSize == 0 ? totalCount/pageSize : (totalCount/pageSize)+1;
        int currentPage = index;

        List<JSONObject> grades = baseMapper.getPage(w,limit,pageSize);

            return new Page(F.f2l(grades,"id"), pageSize, totalCount, totalPage, currentPage);
    }

    //全查
    public List<JSONObject> queryAll(String where) {
        List<JSONObject> list = baseMapper.queryAll(where);
        return F.f2l(list,"id","creator","reverse");
    }

}