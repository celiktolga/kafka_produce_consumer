package com.ttnet.eventdrivenms.entity;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;
import lombok.*;

import java.util.UUID;

@Table("follower")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserFollower {

    @PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private UUID id;
    private String followerList;

}
