angular.module('AppointmentTrackerApp', [])
   .controller('ng-controller', function($scope, $http) {
        $scope.getAppointments = function() {
                    $http.post("http://localhost:8080/appointments.json", $scope.search)
                        .then(
                            function successCallback(response) {
                                console.log(response.data);
                                console.log("Adding data to scope");
                                $scope.appointments = response.data;
                            },
                            function errorCallback(response) {
                                console.log("Unable to get data");
                            });
                            $scope.showTable=true;
                };
        $scope.addAppointment = function() {
                    console.log("About to add the following appointment " + JSON.stringify($scope.newAppointment));
        
                    $http.post("/addAppointment.json", $scope.newAppointment)
                        .then(
                            function successCallback(response) {
                                console.log("Adding appointment to database");
                            },
                            function errorCallback(response) {
                                console.log("Unable to get data");
                            });
                            $scope.newAppointment={};
                            $scope.appointments={};
                            $scope.showme=false;
                            $scope.showTable=false;
                };
        $scope.newAppointment={};
        $scope.appointments={};
        $scope.search={};
        $scope.showTable=false;
        });