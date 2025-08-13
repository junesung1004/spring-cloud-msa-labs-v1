package com.sesac.orderservice.event;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 위 파일이 주문 생성 이벤트 발행 == 즉 메세지를 담는 파일이라고 생각하면 됌
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreatedEvent implements Serializable { // 직렬화 필요

	private static final long serialVersionUID = 1L;

	private Long orderId;
	private Long userId;
	private Long productId;
	private Integer quantity;
	private BigDecimal totalAmount;
	private LocalDateTime createdAt;
}
