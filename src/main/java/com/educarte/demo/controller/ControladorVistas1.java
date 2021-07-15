package com.educarte.demo.controller;
import java.util.*;
import java.util.Optional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.educarte.demo.interfaceService.ICategoriaService;
import com.educarte.demo.interfaceService.IRelaGastoService;
import com.educarte.demo.modelo.Categoria;
import com.educarte.demo.modelo.RelaGasto;

@Controller
@RequestMapping
public class ControladorVistas1 {
	@Autowired
	private IRelaGastoService service;
	@Autowired
	private ICategoriaService serviced;
	@RequestMapping("/listar")
	@PostMapping
	public String listar(Model model) {
		List<RelaGasto> relagastos = service.listar();
		model.addAttribute("relagastos", relagastos);
		return "index";
	}
	@GetMapping("/newcategoria")
	public String agregarcategoria(Model model) {
		model.addAttribute("categoria", new Categoria());
		model.addAttribute("categorias", serviced.listar());
		return "categoria";
	}
	@PostMapping("/saved")
	public String savec(@Valid Categoria cate, Model model) {
		serviced.save(cate);
		return "redirect:/listar";
	}
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("relagasto", new RelaGasto());
		model.addAttribute("relagastos", service.listar());
		model.addAttribute("categoria", new Categoria());
		model.addAttribute("categorias", serviced.listar());
		return "form";
	}
	@PostMapping("/save")
	public String save(@Valid RelaGasto rg, Model model) {
		service.save(rg);
		return "redirect:/listar";
	}

	@GetMapping("/editar/{id_gasto}")
	public String editar(@PathVariable int id_gasto, Model model) {
		Optional<RelaGasto> relagasto = service.listarId(id_gasto);
		model.addAttribute("categoria", new Categoria());
		model.addAttribute("categorias", serviced.listar());
		model.addAttribute("relagasto", relagasto);	
		return "form";
	}
	@GetMapping("/eliminar/{id}")
	public String eliminar(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}

	public String mes(Model model) {
		return "Mes";

	}
	@GetMapping("/consulone")
	public String concepto_mes(Model model) {
		List<RelaGasto> relagastos = service.listar();
		model.addAttribute("relagastos", relagastos);
		return "Mes";
	}
}