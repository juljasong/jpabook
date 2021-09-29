# 테이블 구조
![img_1.png](img_1.png)

# 객체 구조
![img.png](img.png)

- @XXXToOne 연관관계 지연로딩으로 변경
- 영속성 전이 설정
  - Order -> Delivery 영속성 전이 ALL
  - Order -> OrderItem 영속성 전이 ALL