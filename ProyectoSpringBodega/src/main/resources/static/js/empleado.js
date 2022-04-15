function list(){
	$.ajax({
		type : "post",
		url : "/empleado/list",
		success : function(response) {
			$("#empleadoTable").bootstrapTable('load',response);
			$("#empleadoTable tbody").on('click','tr',function() {
				$("#id_rut").val($(this).find("td:eq(0)").text());
				$("#nombre").val($(this).find("td:eq(1)").text());
				$("#btn_group_old").show();
				$("#btn_group_new").hide();
				$("#myModal").modal("show");

			});
		}
	});
}

function select(){
	$.ajax({
		type : "post",
		url : "/empleado/select",
		data: "id_rut=" + $("#id_rut").val(),
		success : function(response) {
			$("#nombre").val(response.nombre);
		}
	});
}

function del(){
	$.ajax({
		type : "post",
		url : "/empleado/delete",
		data: "id_rut=" + $("#id_rut").val(),
		success : function(response) {
			if (response == 1) {
				alert("Se eliminó el registro");
				list();
				$("#myModal").modal("hide");

			}			
		}
	});
}

function update(){
	$.ajax({
		type : "post",
		url : "/empleado/update",
		data: {
			id_rut:$("#id_rut").val(),
			nombre:$("#nombre").val()
			},
		success : function(response) {
			if (response == 1) {
				alert("Se actualizó el registro");
				list();
				$("#myModal").modal("hide");
			}			
		}
	});
}

function add() {
	$("#id_rut").val("");
	$("#nombre").val("");
	$("#myModal").modal("show");
	$("#btn_group_old").hide();
	$("#btn_group_new").show();
}


function insert(){
	$.ajax({
		type : "post",
		url : "/empleado/insert",
		data: {
			id_rut:$("#id_rut").val(),
			nombre:$("#nombre").val()
			},
		success : function(response) {
			if (response == 1) {
				alert("Se insertó el registro");
				list();
				$("#myModal").modal("hide");
			}			
		}
	});
}
