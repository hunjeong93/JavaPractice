package chap08.Sample24;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@SuppressWarnings("unused")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Car {
	@NonNull
	private String color;
	private int doors;
	private String manufacturer;
}
