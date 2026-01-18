package Entities;

import Enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "projects")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String ownerId;
    @Enumerated(EnumType.STRING)
    @Column
    private Status status;
    @CreationTimestamp
    @Column
    private LocalDateTime createdAt;
}
