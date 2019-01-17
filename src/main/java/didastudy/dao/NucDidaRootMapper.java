package didastudy.dao;

import didastudy.entity.NucDidaRoot;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NucDidaRootMapper {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("name") String name);

    int insert(NucDidaRoot record);

    NucDidaRoot selectByPrimaryKey(@Param("id") Long id, @Param("name") String name);

    List<NucDidaRoot> selectAll();

    int updateByPrimaryKey(NucDidaRoot record);
}