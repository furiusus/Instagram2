/**
 * Created by furiusus on 7/8/17.
 */
var controlador=app.controller('MyController',function ($scope,$http) {
    $scope.pagina=null;
    {

        $scope.cliente=null;
        $scope.producto=null;
        $scope.productoTotal=null;
        $scope.cantidadTotal=null;
        $scope.cantidad=null;
        $scope.total=null;
        $scope.precio=null;
    }
    {
        $scope.total=0;
        $scope.calcular=function () {
            if($scope.producto==="pollo"){
                $scope.precio=16;
            }
            if($scope.producto==="pavita"){
                $scope.precio=30;
            }
            if($scope.producto==="huevo"){
                $scope.precio=8;
            }
            $scope.total=$scope.cantidad*$scope.precio;
        };

    }
});