package didastudy.dao;

import didastudy.entity.NucDidaTag;
import java.util.List;

public interface NucDidaTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaTag record);

    NucDidaTag selectByPrimaryKey(Long id);

    List<NucDidaTag> selectAll();

    int updateByPrimaryKey(NucDidaTag record);
}