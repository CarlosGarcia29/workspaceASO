package com.bbva.zic.accountsv02.dao.model.b402;

import java.util.Date;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Formato;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;


/**
 * Formato de datos <code>BGM402A</code> de la transacci&oacute;n <code>B402</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "BGM402A")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoBGM402A {
	
	/**
	 * <p>Campo <code>FECSIST</code>, &iacute;ndice: <code>1</code>, tipo: <code>FECHA</code>
	 */
	@Campo(indice = 1, nombre = "FECSIST", tipo = TipoCampo.FECHA, longitudMinima = 10, longitudMaxima = 10, formato = "yyyy-MM-dd")
	private Date fecsist;
	
	/**
	 * <p>Campo <code>CCC</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "CCC", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 24, longitudMaxima = 24)
	private String ccc;
	
	/**
	 * <p>Campo <code>CLAVEB</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "CLAVEB", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 18, longitudMaxima = 18)
	private String claveb;
	
	/**
	 * <p>Campo <code>CTACEN</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "CTACEN", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 24, longitudMaxima = 24)
	private String ctacen;
	
	/**
	 * <p>Campo <code>CONCC</code>, &iacute;ndice: <code>5</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 5, nombre = "CONCC", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String concc;
	
	/**
	 * <p>Campo <code>SUBPRO</code>, &iacute;ndice: <code>6</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 6, nombre = "SUBPRO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 38, longitudMaxima = 38)
	private String subpro;
	
	/**
	 * <p>Campo <code>CCCASO</code>, &iacute;ndice: <code>7</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 7, nombre = "CCCASO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 24, longitudMaxima = 24)
	private String cccaso;
	
	/**
	 * <p>Campo <code>DIVISA</code>, &iacute;ndice: <code>8</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 8, nombre = "DIVISA", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 25, longitudMaxima = 25)
	private String divisa;
	
	/**
	 * <p>Campo <code>SALDIS</code>, &iacute;ndice: <code>9</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 9, nombre = "SALDIS", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String saldis;
	
	/**
	 * <p>Campo <code>DISPON</code>, &iacute;ndice: <code>10</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 10, nombre = "DISPON", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String dispon;
	
	/**
	 * <p>Campo <code>LIMITE</code>, &iacute;ndice: <code>11</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 11, nombre = "LIMITE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String limite;
	
	/**
	 * <p>Campo <code>EXCMAX</code>, &iacute;ndice: <code>12</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 12, nombre = "EXCMAX", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String excmax;
	
	/**
	 * <p>Campo <code>EXCVEN</code>, &iacute;ndice: <code>13</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 13, nombre = "EXCVEN", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String excven;
	
	/**
	 * <p>Campo <code>EXCDOM</code>, &iacute;ndice: <code>14</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 14, nombre = "EXCDOM", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String excdom;
	
	/**
	 * <p>Campo <code>EXCCAJ</code>, &iacute;ndice: <code>15</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 15, nombre = "EXCCAJ", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String exccaj;
	
	/**
	 * <p>Campo <code>EXCCOM</code>, &iacute;ndice: <code>16</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 16, nombre = "EXCCOM", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String exccom;
	
	/**
	 * <p>Campo <code>SALRET</code>, &iacute;ndice: <code>17</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 17, nombre = "SALRET", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String salret;
	
	/**
	 * <p>Campo <code>SALIMP</code>, &iacute;ndice: <code>18</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 18, nombre = "SALIMP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String salimp;
	
	/**
	 * <p>Campo <code>CON1</code>, &iacute;ndice: <code>19</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 19, nombre = "CON1", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con1;
	
	/**
	 * <p>Campo <code>CON2</code>, &iacute;ndice: <code>20</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 20, nombre = "CON2", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con2;
	
	/**
	 * <p>Campo <code>CON3</code>, &iacute;ndice: <code>21</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 21, nombre = "CON3", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con3;
	
	/**
	 * <p>Campo <code>CON4</code>, &iacute;ndice: <code>22</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 22, nombre = "CON4", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con4;
	
	/**
	 * <p>Campo <code>CON5</code>, &iacute;ndice: <code>23</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 23, nombre = "CON5", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con5;
	
	/**
	 * <p>Campo <code>CON6</code>, &iacute;ndice: <code>24</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 24, nombre = "CON6", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con6;
	
	/**
	 * <p>Campo <code>CON7</code>, &iacute;ndice: <code>25</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 25, nombre = "CON7", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con7;
	
	/**
	 * <p>Campo <code>CON8</code>, &iacute;ndice: <code>26</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 26, nombre = "CON8", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con8;
	
	/**
	 * <p>Campo <code>CON9</code>, &iacute;ndice: <code>27</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 27, nombre = "CON9", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con9;
	
	/**
	 * <p>Campo <code>ULTLIQ</code>, &iacute;ndice: <code>28</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 28, nombre = "ULTLIQ", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 10, longitudMaxima = 10)
	private String ultliq;
	
	/**
	 * <p>Campo <code>SALVAL</code>, &iacute;ndice: <code>29</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 29, nombre = "SALVAL", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String salval;
	
	/**
	 * <p>Campo <code>PROMANU</code>, &iacute;ndice: <code>30</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 30, nombre = "PROMANU", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String promanu;
	
	/**
	 * <p>Campo <code>PROMMES</code>, &iacute;ndice: <code>31</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 31, nombre = "PROMMES", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String prommes;
	
	/**
	 * <p>Campo <code>PROMPER</code>, &iacute;ndice: <code>32</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 32, nombre = "PROMPER", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String promper;
	
	/**
	 * <p>Campo <code>CON44</code>, &iacute;ndice: <code>33</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 33, nombre = "CON44", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con44;
	
	/**
	 * <p>Campo <code>SALADEU</code>, &iacute;ndice: <code>34</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 34, nombre = "SALADEU", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String saladeu;
	
	/**
	 * <p>Campo <code>SALMISM</code>, &iacute;ndice: <code>35</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 35, nombre = "SALMISM", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String salmism;
	
	/**
	 * <p>Campo <code>SALDIST</code>, &iacute;ndice: <code>36</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 36, nombre = "SALDIST", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String saldist;
	
	/**
	 * <p>Campo <code>SALEXTR</code>, &iacute;ndice: <code>37</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 37, nombre = "SALEXTR", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String salextr;
	
	/**
	 * <p>Campo <code>SALVOUC</code>, &iacute;ndice: <code>38</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 38, nombre = "SALVOUC", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String salvouc;
	
	/**
	 * <p>Campo <code>CONSAL</code>, &iacute;ndice: <code>39</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 39, nombre = "CONSAL", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String consal;
	
	/**
	 * <p>Campo <code>LIMCI</code>, &iacute;ndice: <code>40</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 40, nombre = "LIMCI", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String limci;
	
	/**
	 * <p>Campo <code>DISCI</code>, &iacute;ndice: <code>41</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 41, nombre = "DISCI", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String disci;
	
	/**
	 * <p>Campo <code>LIMREM</code>, &iacute;ndice: <code>42</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 42, nombre = "LIMREM", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String limrem;
	
	/**
	 * <p>Campo <code>DISREM</code>, &iacute;ndice: <code>43</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 43, nombre = "DISREM", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String disrem;
	
	/**
	 * <p>Campo <code>CON109</code>, &iacute;ndice: <code>44</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 44, nombre = "CON109", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con109;
	
	/**
	 * <p>Campo <code>CON110</code>, &iacute;ndice: <code>45</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 45, nombre = "CON110", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con110;
	
	/**
	 * <p>Campo <code>CON111</code>, &iacute;ndice: <code>46</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 46, nombre = "CON111", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con111;
	
	/**
	 * <p>Campo <code>CON112</code>, &iacute;ndice: <code>47</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 47, nombre = "CON112", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con112;
	
	/**
	 * <p>Campo <code>CON10</code>, &iacute;ndice: <code>48</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 48, nombre = "CON10", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con10;
	
	/**
	 * <p>Campo <code>LIMEXT</code>, &iacute;ndice: <code>49</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 49, nombre = "LIMEXT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String limext;
	
	/**
	 * <p>Campo <code>DISEXT</code>, &iacute;ndice: <code>50</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 50, nombre = "DISEXT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String disext;
	
	/**
	 * <p>Campo <code>CON113</code>, &iacute;ndice: <code>51</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 51, nombre = "CON113", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con113;
	
	/**
	 * <p>Campo <code>CON114</code>, &iacute;ndice: <code>52</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 52, nombre = "CON114", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String con114;
	
	/**
	 * <p>Campo <code>SALPLA</code>, &iacute;ndice: <code>53</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 53, nombre = "SALPLA", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 21, longitudMaxima = 21)
	private String salpla;
	
	/**
	 * <p>Campo <code>CONLP</code>, &iacute;ndice: <code>54</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 54, nombre = "CONLP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String conlp;
	
}