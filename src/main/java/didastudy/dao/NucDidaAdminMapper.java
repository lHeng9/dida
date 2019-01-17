package didastudy.dao;

import didastudy.entity.NucDidaAdmin;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NucDidaAdminMapper {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("name") String name);

    int insert(NucDidaAdmin record);

    NucDidaAdmin selectByPrimaryKey(@Param("id") Long id, @Param("name") String name);

    List<NucDidaAdmin> selectAll();

    int updateByPrimaryKey(NucDidaAdmin record);
}