package Entities;

import Enums.Priority;
import Enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column
    private String projectId;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String assigneeId;
    @Enumerated(EnumType.STRING)
    @Column
    private Status status;
    @Enumerated(EnumType.STRING)
    @Column
    private Priority priority;
    @Column
    private LocalDateTime dueDate;
    @CreationTimestamp
    @Column
    private LocalDateTime createdAt;
}
