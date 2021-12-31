package com.h2kinfosys.learn.day09;

// Interface can extend multiple interfaces
// Abstract class may skip implementing interface methods 
public interface Reachable extends Callable, WebAware{

	void validateAddress(String address);
}
