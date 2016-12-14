angular.module('dailyExpenceApp')
		   .service('foodService',['$http','$filter','$rootScope','$q',	
		                                 foodService]);
function foodService($http,$filter,$rootScope,appConstants,$q) {
	return {
		addFoodExpense : addFoodExpense,
		getFoodData:getFoodData
	
	};
	function addFoodExpense(foodDto){
		return $http.post('/insertFood', foodDto)
		.then('success')
		.catch('error');
	}
	function getFoodData(){
		
	
			return $http.get('/getAllFood')
			.then(getFoodSuccess)
			.catch(getFoodError);
	
		
	}
	function getFoodSuccess(response){
		return response.data;
	}
	function getFoodError(response){
		return "Failed To Get FoodData! Response";
	}
}