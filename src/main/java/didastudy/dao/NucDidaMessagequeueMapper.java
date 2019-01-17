package didastudy.dao;

import didastudy.entity.NucDidaMessagequeue;
import java.util.List;

public interface NucDidaMessagequeueMapper {
    int insert(NucDidaMessagequeue record);

    List<NucDidaMessagequeue> selectAll();
}