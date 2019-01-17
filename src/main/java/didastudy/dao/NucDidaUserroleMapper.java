package didastudy.dao;

import didastudy.entity.NucDidaUserrole;
import java.util.List;

public interface NucDidaUserroleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaUserrole record);

    NucDidaUserrole selectByPrimaryKey(Long id);

    List<NucDidaUserrole> selectAll();

    int updateByPrimaryKey(NucDidaUserrole record);
}