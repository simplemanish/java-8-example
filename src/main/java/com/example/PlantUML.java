package com.example;

import java.util.Objects;
import java.util.Set;
import org.springframework.context.annotation.Conditional;
import com.ms.player.validator.CreateGroup;
import com.ms.player.validator.UpdateGroup;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PlayerForm {

	private Long id;

	@Size(min = 4, max = 20, message = "{validation.size}", groups = {UpdateGroup.class, CreateGroup.class})
	@NotNull(message = "Cannot be null", groups = {CreateGroup.class})
	private String firstname;

	public PlayerForm() {

	}

	public PlayerForm(Long id, String firstname) {
		super();
		this.id = id;
		this.firstname = firstname;
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
}

