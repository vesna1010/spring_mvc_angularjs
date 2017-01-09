<div class="row">
	<h3 class="text-center">Add New department</h3>
	<br>
	<form class="form-horizontal" name="departmentForm">
		<div class="form-group">
			<label for="departmentName"
				class="control-label col-sm-2 col-sm-offset-3">Department name:
			</label>
			<div class="col-sm-4">
				<input class="form-control" type="text" name="departmentName"
					ng-model="department.departmentName" ng-required="true" ng-minlength="5"
					ng-pattern="/^([a-zA-Z0-9]+\s?){5,}$/"> <span
					ng-show="departmentForm.departmentName.$dirty && departmentForm.departmentName.$error.required"
					class="text-danger"> Enter department name. <br> </span> <span
					ng-show="departmentForm.departmentName.$dirty && departmentForm.departmentName.$error.minlength"
					class="text-danger"> department name must minimum 5 characters
					long. <br></span> <span
					ng-show="departmentForm.departmentName.$dirty && departmentForm.departmentName.$error.pattern"
					class="text-danger"> Enter only alphabetical letters, numbers and spaces. </span>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-4 col-sm-offset-5">
				<button type="submit" class="btn btn-default"
					ng-click="saveDepartment(department)" ng-disabled="departmentForm.$invalid">
					Save/Update Department</button>
			</div>
		</div>
	</form>
</div>

