/**
 * Created by furiu on 5/05/2017.
 */

var controlador = app.controller("MyController", function ($scope) {
    $scope.correo = null;
    $scope.nombre = null;
    $scope.sexo = null;
    $scope.usuario = null;
    $scope.pass = null;
    $scope.usuarioA=["rony","furiusus"];
    $scope.passA=["123","456"];
    $scope.PaginaPrincipal = true;
    $scope.PaginaSecundaria = false;

    $scope.ocultarPaginas = function () {
        $scope.PaginaPrincipal = false;
        $scope.PaginaSecundaria = false;
    };
    $scope.verPrincipal = function () {
        $scope.ocultarPaginas();
        $scope.PaginaPrincipal = true;
    };

    $scope.verSecundaria = function () {
        $scope.ocultarPaginas();
        $scope.PaginaSecundaria = true;
    };
    $scope.Ingresar = function () {
        for($scope.i=0;$scope.i<2;$scope.i++){
            if ($scope.usuario == $scope.usuarioA[$scope.i] && $scope.pass == $scope.passA[$scope.i]) {
                $scope.verSecundaria();
            }
        }

    }
});