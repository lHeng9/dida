package didastudy.dao;

import didastudy.entity.NucDidaTeacher;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NucDidaTeacherMapper {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("number") String number);

    int insert(NucDidaTeacher record);

    NucDidaTeacher selectByPrimaryKey(@Param("id") Long id, @Param("number") String number);

    List<NucDidaTeacher> selectAll();

    int updateByPrimaryKey(NucDidaTeacher record);
}