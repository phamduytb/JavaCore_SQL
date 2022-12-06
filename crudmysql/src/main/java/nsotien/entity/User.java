package nsotien.entity;/*
java by nsotien tv .......
Name : nsotien
Time : 14:58
Date : 06/12/2022
*/

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
@Table(name = "userspring")
@EntityListeners(AuditingEntityListener.class)
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @NotBlank
        private String name;


        private String avatar;// URL

        @Column(unique = true)
        private String username;
        private String password;

        @DateTimeFormat(pattern = "dd/MM/yyyy")
        private Date birthdate;

        @Transient // field is not persistent.
        private MultipartFile file;

        @CreatedDate
        @Column(name = "date_now")
        private Date createdAt;
}
