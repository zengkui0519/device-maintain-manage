package cn.com.bosi.itms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.beetl.sql.core.annotatoin.Table;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TEST")
public class Test implements Serializable {
    private static final long serialVersionUID = -2388779790405094778L;

    private Long id ;
    private String name ;
}
