package didastudy.dao;

import didastudy.entity.NucDidaPost;
import java.util.List;

public interface NucDidaPostMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaPost record);

    NucDidaPost selectByPrimaryKey(Long id);

    List<NucDidaPost> selectAll();

    int updateByPrimaryKey(NucDidaPost record);
}