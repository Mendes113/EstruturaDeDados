package main

import (
	"fmt"
	"time"
)

func main(){

	vet := []int{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
	
	fmt.Println(vet)
	fmt.Println("Ordenado bubble sort")
	startTime := time.Now()
	fmt.Println(bubble(vet))
	elapsedBuble := time.Since(startTime)
	
	fmt.Printf("Tempo de execução: %v nanossegundos\n", elapsedBuble.Nanoseconds())

	fmt.Println("Ordenado selection sort")
	startTimeSell := time.Now()
	fmt.Println(selectionSort(vet))
	elapsedSell := time.Since(startTimeSell)
	
	fmt.Printf("Tempo de execução: %v nanossegundos\n", elapsedSell.Nanoseconds())

	fmt.Println("Ordenado insertion sort")
	startTimeInser := time.Now()
	fmt.Println(insertionSort(vet))
	elapsedInser := time.Since(startTimeInser)
	
	fmt.Printf("Tempo de execução: %v nanossegundos\n", elapsedInser.Nanoseconds())
	
	fmt.Println("Ordenado shell sort")
	startTimeShell := time.Now()
	fmt.Println(shellSort(vet))
	elapsedShell := time.Since(startTimeShell)
	fmt.Printf("Tempo de execução: %v nanossegundos\n", elapsedShell.Nanoseconds())
	
	fmt.Println("Ordenado quick sort")
	startTimeQuick := time.Now()
	fmt.Println(quickSortStart(vet))
	elapsedQuick := time.Since(startTimeQuick)
	fmt.Printf("Tempo de execução: %v nanossegundos\n", elapsedQuick.Nanoseconds())
	
}

//buble sort



func bubble(array []int)[]int  {
	for i := 0; i < len(array); i++ {
		for j := 0; j < len(array)-1; j++ {
			if array[j]>array[j+1]{
				array[j],array[j+1]=array[j+1],array[j]
			}
		}
	}
	return array
}


func selectionSort(array []int)[]int  {
	for i := 0; i < len(array); i++ {
		min := i
		for j := i+1; j < len(array); j++ {
			if array[j]<array[min]{
				min = j
			}
		}
		array[i],array[min]=array[min],array[i]
	}
	return array
}


func insertionSort(array []int ) []int{
	for i := 0; i < len(array); i++ {
		key := array[i]
		j := i-1
		for j >= 0 && array[j]>key{
			array[j+1]=array[j]
			j--
		}
		array[j+1]=key
	}
	return array
}



func shellSort(array []int) []int{
	for gap := len(array)/2; gap > 0; gap/=2 {
		for i := gap; i < len(array); i++ {
			temp := array[i]
			j := i
			for j >= gap && array[j-gap]>temp{
				array[j]=array[j-gap]
				j-=gap
			}
			array[j]=temp
		}
	}
	return array
}



func partition(arr []int, low, high int) ([]int, int) {
	pivot := arr[high] //set the pivot as high(last element)
	i := low 		 //set the index of smaller element as low(first element)
	for j := low; j < high; j++ { //traverse the array
		if arr[j] < pivot { //if the current element is smaller than the pivot
			arr[i], arr[j] = arr[j], arr[i] //swap the current element with the element at index i
			i++ //increment the index of smaller element
		}
	}
	arr[i], arr[high] = arr[high], arr[i] //swap the pivot with the element at index i
	return arr, i //return the array and the index of the pivot
}


func quickSort(arr []int, low, high int) []int {
	if low < high { //if low is smaller than high
		var p int //declare a variable to store the index of the pivot
		arr, p = partition(arr, low, high) //partition the array and store the index of the pivot
		arr = quickSort(arr, low, p-1) //sort the left subarray
		arr = quickSort(arr, p+1, high) //sort the right subarray
	}
	return arr
}

func quickSortStart(arr []int) []int {
	return quickSort(arr, 0, len(arr)-1) //call the quicksort function with low as 0 and high as the length of the array minus 1
}