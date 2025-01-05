package vn.edu.usth.mcma.backend.entity;

import constants.SeatAvailability;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

/**
 * not extending AbstractAuditing due to @SuperBuilder error
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Seat implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private SeatPK pk;
    @Column(columnDefinition = "TINYINT")
    private Integer typeId;
    @Column
    private String name;
    @Column
    @Enumerated(EnumType.ORDINAL)
    private SeatAvailability availability;
    @CreatedBy
    @Column(updatable = false)
    private Long createdBy;
    @LastModifiedBy
    @Column
    private Long lastModifiedBy;
    @CreatedDate
    @Column(updatable = false)
    private Instant createdDate;
    @LastModifiedDate
    @Column
    private Instant lastModifiedDate;
}
