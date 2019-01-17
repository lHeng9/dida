package didastudy.dao;

import didastudy.entity.NucDidaUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NucDidaUserMapper {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("number") String number, @Param("phone") String phone);

    int insert(NucDidaUser record);

    NucDidaUser selectByPrimaryKey(@Param("id") Long id, @Param("number") String number, @Param("phone") String phone);

    List<NucDidaUser> selectAll();

    int updateByPrimaryKey(NucDidaUser record);
}