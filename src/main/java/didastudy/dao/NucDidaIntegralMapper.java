package didastudy.dao;

import didastudy.entity.NucDidaIntegral;
import java.util.List;

public interface NucDidaIntegralMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaIntegral record);

    NucDidaIntegral selectByPrimaryKey(Long id);

    List<NucDidaIntegral> selectAll();

    int updateByPrimaryKey(NucDidaIntegral record);
}