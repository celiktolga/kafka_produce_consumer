package com.ttnet.eventdrivenms.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import lombok.*;

@Table("user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private UUID id;
    private String name;
    private String surname;
    private String followerList;
    @CreatedDate
    private Date date;


}
