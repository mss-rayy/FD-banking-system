package kh.edu.ctasd.dto;

public record CustomerResponse(
        String fullName,
        String email,
        String gender
) {
}
