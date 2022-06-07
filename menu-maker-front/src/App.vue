<script setup>
</script>

<template>

  <div class="main-block">
        <h1>Ajoute ton menu</h1>
        <form action="/">
          <input type="text" name="plat" id="plat" placeholder="Plat" required/>
          <input type="text" name="livre" id="livre" placeholder="Livre"/>
          <input type="text" name="page" id="page" placeholder="Page"/>
          <hr>
          <div class="evening">
            <input type="checkbox" id="evening" name="evening" checked/>
            <label for="evening">Evening</label>
          </div>
          <hr>
          <div class="btn-block">
            <button type="submit" href="/">Submit</button>
          </div>
        </form>
      </div>
</template>

<style>
@import './assets/test.css';

#app {
  max-width: 1280px;
  margin: 0 auto;
  padding: 2rem;

  font-weight: normal;
}

header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

a,
.green {
  text-decoration: none;
  color: hsla(160, 100%, 37%, 1);
  transition: 0.4s;
}

@media (hover: hover) {
  a:hover {
    background-color: hsla(160, 100%, 37%, 0.2);
  }
}

@media (min-width: 1024px) {
  body {
    display: flex;
    place-items: center;
  }

  #app {
    display: grid;
    grid-template-columns: 1fr 1fr;
    padding: 0 2rem;
  }

  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }

  .logo {
    margin: 0 2rem 0 0;
  }
}
</style>
