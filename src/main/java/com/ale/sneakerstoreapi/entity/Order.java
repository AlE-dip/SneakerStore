package com.ale.sneakerstoreapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "`Order`")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paypalOrderId;
    private String orderNumber;
    private String total;
    private Date date;
    private PaymentStatus paymentStatus;
    private String captureId;
    private String approveUrl;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public enum PaymentStatus {
        NEW,
        PAID,
        FAILED,
        REFUND
    }
}
