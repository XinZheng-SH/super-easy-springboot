package top.zhengxin1024.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("tbl_users")
public class User implements Serializable {

    private static final long serialVersionUID = -8064251796984414018L;


    /**
     * 用户账号
     */
    @TableId(type = IdType.AUTO)
    private String userNo;

    /**
     * 密码
     */
    private String userPwd;

    /**
     * 用户昵称
     */
    private String userName;

}
