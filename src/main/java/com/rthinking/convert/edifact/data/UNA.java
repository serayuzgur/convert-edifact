package com.rthinking.convert.edifact.data;

/**
 * data element separator
 * component data element separator
 * repetition separator
 * segment terminator
 * release indicator
 * ---Defaults---
 * component data element separator (: in this sample)
 * data element separator (+ in this sample)
 * decimal mark (. in this sample)
 * release character (? in this sample)
 * reserved, must be a space
 * segment terminator (' in this sample)
 */

public class UNA {
	private char componentDataElement = ':';
	private char dataElement = '+';
	private char decimal = '.';
	private char repetition = '*';
	private char release = '?';
	private char segment = '\'';

	public UNA() {
	}

	public UNA(byte componentDataElement, byte dataElement, byte decimal, byte release, byte segment) {
		this.componentDataElement = (char) componentDataElement;
		this.dataElement = (char) dataElement;
		this.decimal = (char) decimal;
		this.release = (char) release;
		this.segment = (char) segment;
	}

	public char getDataElement() {
		return dataElement;
	}

	public void setDataElement(char dataElement) {
		this.dataElement = dataElement;
	}

	public char getComponentDataElement() {
		return componentDataElement;
	}

	public void setComponentDataElement(char componentDataElement) {
		this.componentDataElement = componentDataElement;
	}

	public char getRepetition() {
		return repetition;
	}

	public void setRepetition(char repetition) {
		this.repetition = repetition;
	}

	public char getSegment() {
		return segment;
	}

	public void setSegment(char segment) {
		this.segment = segment;
	}

	public char getRelease() {
		return release;
	}

	public void setRelease(char release) {
		this.release = release;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UNA{");
		sb.append("componentDataElement=").append(componentDataElement);
		sb.append(", dataElement=").append(dataElement);
		sb.append(", decimal=").append(decimal);
		sb.append(", repetition=").append(repetition);
		sb.append(", release=").append(release);
		sb.append(", segment=").append(segment);
		sb.append('}');
		return sb.toString();
	}
}
