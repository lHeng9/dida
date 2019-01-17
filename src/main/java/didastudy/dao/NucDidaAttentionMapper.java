package didastudy.dao;

import didastudy.entity.NucDidaAttention;
import java.util.List;

public interface NucDidaAttentionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaAttention record);

    NucDidaAttention selectByPrimaryKey(Long id);

    List<NucDidaAttention> selectAll();

    int updateByPrimaryKey(NucDidaAttention record);
}