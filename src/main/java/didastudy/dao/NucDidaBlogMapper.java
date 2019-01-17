package didastudy.dao;

import didastudy.entity.NucDidaBlog;
import java.util.List;

public interface NucDidaBlogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaBlog record);

    NucDidaBlog selectByPrimaryKey(Long id);

    List<NucDidaBlog> selectAll();

    int updateByPrimaryKey(NucDidaBlog record);
}