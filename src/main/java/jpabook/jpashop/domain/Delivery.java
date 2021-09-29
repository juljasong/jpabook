package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    // 배송지 주소
    private String city;
    private String street;
    private String zipcode;

    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;


}
