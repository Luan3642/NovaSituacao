<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Tag para colocar icon na página-->
        <link rel="icon" href="img/pessoa-icon.png" type="image/x-icon"/>
        <!-- Importações do bootstrap-->
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css"/>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css">
        <title>Cadastro de Cliente</title>
    </head>
    <body>
        <!-- Importação para o cabeçalho-->
        <c:import url="Cabecalho.jsp"/>
        <form action="ClienteServlet" method="GET">
            <div class="container" style="padding-top: 65px">
                <div class="row">
                    <div class="col-md-1"></div>
                    <!-- Legendas do topo -->
                    <div class="col-md-5"><legend>Informações Pessoais</legend></div>
                    <div class="col-md-5"><legend>Endereço</legend></div>
                    <div class="col-md-1"></div>
                </div>
                <!-- Campos de cadastro-->
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-5">
                        <label class="control-label">Digite seu nome:</label>
                        <input class="form-control" placeholder="Digite seu nome" name="nomeCliente" />
                    </div>
                    <div class="col-md-5">
                        <label class="control-label">Digite seu País:</label>
                        <input class="form-control" placeholder="Digite seu País " name="clientePais" />                
                    </div>
                    <div class="col-md-1"></div>
                </div>
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-5"><label class="control-label ">Digite seu CPF:</label>
                        <input class="form-control" placeholder="Digite seu CPF" name="cpfCliente" /></div>
                    <div class="col-md-5">
                        <label class="control-label ">Digite seu CEP:</label>
                        <input class="form-control" placeholder="Digite seu CEP" name="cep" />
                    </div>
                    <div class="col-md-1"></div>
                </div>
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-5">
                        <label class="control-label ">Digite seu RG:</label>
                        <input class="form-control" placeholder="Digite seu RG" name="rgCliente" />
                    </div>
                    <div class="col-md-5">
                        <label class="control-label ">Digite seu complemento:</label>
                        <input class="form-control" placeholder="Digite seu complemento" name="complemento" />
                    </div>
                    <div class="col-md-1"></div>
                </div>
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-5">
                        <label> Digite seu email: </label>
                        <div class="input-group">
                            <span class="input-group-addon">@</span>
                            <input class="form-control" type="email"  name="emailCliente" />  
                        </div>
                    </div>
                    <div class="col-md-5">
                        <label for="email">Digite seu bairro:</label>
                        <input class="form-control" placeholder="Digite seu bairro" name="bairro" />
                    </div>
                    <div class="col-md-1"></div>
                </div>
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-5">
                        <label class="control-label ">Digite seu sexo:</label>
                        <select class="form-control" name="sexoCliente">
                            <option>Masculino</option>
                            <option>Feminino</option>
                        </select>
                    </div>
                    <div class="col-md-5">
                        <label for="email">Digite sua cidade:</label>
                        <input class="form-control" placeholder="Digite sua cidade" name="cidade" />
                    </div>
                    <div class="col-md-1"></div>
                </div>
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-5">
                        <label class="control-label">Digite sua idade:</label>
                        <select class="form-control" name="idade">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                            <option>6</option>
                            <option>7</option>
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                            <option>11</option>
                            <option>12</option>
                            <option>13</option>
                            <option>14</option>
                            <option>15</option>
                            <option>16</option>
                            <option>17</option>
                            <option>18</option>
                            <option>19</option>
                            <option>20</option>
                            <option>21</option>
                            <option>22</option>
                            <option>23</option>
                            <option>24</option>
                            <option>25</option>
                            <option>26</option>
                            <option>27</option>
                            <option>28</option>
                            <option>29</option>
                            <option>30</option>
                            <option>31</option>
                            <option>32</option>
                            <option>33</option>
                            <option>34</option>
                            <option>35</option>
                            <option>36</option>
                            <option>37</option>
                            <option>38</option>
                            <option>39</option>
                            <option>40</option>
                            <option>41</option>
                            <option>42</option>
                            <option>43</option>
                            <option>44</option>
                            <option>45</option>
                            <option>46</option>
                            <option>47</option>
                            <option>48</option>
                            <option>49</option>
                            <option>50</option>
                            <option>51</option>
                            <option>52</option>
                            <option>53</option>
                            <option>54</option>
                            <option>55</option>
                            <option>56</option>
                            <option>57</option>
                            <option>58</option>
                            <option>59</option>
                            <option>60</option>
                            <option>61</option>
                            <option>62</option>
                            <option>63</option>
                            <option>64</option>
                            <option>65</option>
                            <option>66</option>
                            <option>67</option>
                            <option>68</option>
                            <option>69</option>
                            <option>70</option>
                            <option>71</option>
                            <option>72</option>
                            <option>73</option>
                            <option>74</option>
                            <option>75</option>
                            <option>76</option>
                            <option>77</option>
                            <option>78</option>
                            <option>79</option>
                            <option>80</option>
                            <option>81</option>
                            <option>82</option>
                            <option>83</option>
                            <option>84</option>
                            <option>85</option>
                            <option>86</option>
                            <option>87</option>
                            <option>88</option>
                            <option>89</option>
                            <option>90</option>
                            <option>91</option>
                            <option>92</option>
                            <option>93</option>
                            <option>94</option>
                            <option>95</option>
                            <option>96</option>
                            <option>97</option>
                            <option>98</option>
                            <option>99</option>
                            <option>100</option>                    
                        </select>
                    </div>
                    <div class="col-md-5">
                        <label for="email">Digite seu estado:</label>
                        <input class="form-control" placeholder="Digite seu estado" name="estado" />
                    </div>
                    <div class="col-md-1"></div>
                </div>
                <div class="row">
                    <div class="col-md-5"></div>
                    <div class="col-md-2 " style="margin-top: 20px;">
                        <input type="submit" class="btn btn-primary" value="Cadastrar Cliente" />
                    </div>
                    <div class="col-md-5"></div>
                </div>
            </div>
        </form>
        <!-- Padding utilizado para arrumar footer-->
        <div style="padding-top: 60px;">
        </div>
        <c:import url="Rodape.jsp" />
    </body>
</html>