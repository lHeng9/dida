package didastudy.dao;

import didastudy.entity.NucDidaRole;
import java.util.List;

public interface NucDidaRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaRole record);

    NucDidaRole selectByPrimaryKey(Long id);

    List<NucDidaRole> selectAll();

    int updateByPrimaryKey(NucDidaRole record);
}