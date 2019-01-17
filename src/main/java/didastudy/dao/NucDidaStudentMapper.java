package didastudy.dao;

import didastudy.entity.NucDidaStudent;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NucDidaStudentMapper {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("number") String number);

    int insert(NucDidaStudent record);

    NucDidaStudent selectByPrimaryKey(@Param("id") Long id, @Param("number") String number);

    List<NucDidaStudent> selectAll();

    int updateByPrimaryKey(NucDidaStudent record);
}