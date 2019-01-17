package didastudy.dao;

import didastudy.entity.NucDidaLiveness;
import java.util.List;

public interface NucDidaLivenessMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaLiveness record);

    NucDidaLiveness selectByPrimaryKey(Long id);

    List<NucDidaLiveness> selectAll();

    int updateByPrimaryKey(NucDidaLiveness record);
}