
<template>
    <div class="main-block">
        <h1>Ajoute ton menu</h1>
        <form @submit.prevent="()=>{return null}">
          <input v-model="plat" type="text" name="plat" placeholder="Plat" required/>
          <input v-model="livre" type="text" name="livre" placeholder="Livre"/>
          <input v-model="page" type="text" name="page" placeholder="Page"/>
          <smart-tagz ref="tags"
            editable
            inputPlaceholder="Select Ingredients ..."
            :allowPaste="{delimiter: ','}"
            :allowDuplicates="false"
            :maxTags="20"
            :theme="{
              primary: '#545454',
              background: '#ebebeb',
              tagTextColor: '#fff',
            }"
          />
          <hr>
          <div class="evening">
              <input v-model="evening" type="checkbox" name="evening" checked/>
              <label for="evening">Evening</label>
          </div>
          <div class="fast">
              <input v-model="fast" type="checkbox" name="fast" checked/>
              <label for="fast">Fast</label>
          </div>
          <hr>
          <div class="btn-block">
              <button type="button" name="submit" @click="send">Submit</button>
          </div>
          <p class="error">{{ error }}</p>
        </form>
    </div>
</template>
  
<script setup>

import { ref, computed } from 'vue';
import { SmartTagz } from "smart-tagz";

const plat = ref('');
const livre = ref('');
const page = ref('');
const evening = ref(false);
const fast = ref(false);
const error = ref('');
const tags =ref(null);
const ingredients = computed(()=>{
  const table = [];
  for (const data of tags.value.tagsData){
    table.push(data.value);
  }
  return table;
})

function send() {
  if (plat.value === ''){
    error.value = 'Le plat ne doit pas être vide'
  } else {
    error.value = ''
    console.log(plat.value, livre.value, page.value, evening.value, fast.value, ingredients.value);
  }
}

</script>


<style>
@import '../assets/test.css';
.icon-wrapper[data-v-1a43cbde]{align-items:center;display:flex;height:.5rem;justify-content:center;width:.5rem}.icon-wrapper[data-v-1a43cbde] svg[data-v-1a43cbde]{fill:#000;height:100%;width:100%}
.tag-container[data-v-bb7ceecc]{align-items:center;border-radius:.2rem;display:flex;filter:drop-shadow(2px 2px 4px rgba(26,15,15,.25));justify-content:center;margin:.4rem .25rem;padding:.4rem .1rem .4rem .4rem;-webkit-user-select:none;-moz-user-select:none;user-select:none}.tag-container[data-v-bb7ceecc].highlight[data-v-bb7ceecc]{background-color:#b20000}.tag-container[data-v-bb7ceecc].no-remove[data-v-bb7ceecc]{padding-right:.5rem}.tag-name[data-v-bb7ceecc]{font-size:1rem}.tag-edit-input[data-v-bb7ceecc]{background:hsla(0,0%,100%,.4);border:0;font-size:.85rem;min-width:100px;outline:0;width:0}button[data-v-bb7ceecc]{align-items:center;background:#fff;border:0;border-radius:50%;cursor:pointer;display:flex;height:1rem;justify-content:center;margin-left:.5rem;margin-right:.2rem;outline:none;padding:0;width:1rem}
.tags-container[data-v-acc9a86e]{align-items:flex-start;display:flex;flex-wrap:wrap;justify-content:flex-start}.tags-list-enter-active[data-v-acc9a86e],.tags-list-leave-active[data-v-acc9a86e]{transition:all .2s}.tags-list-enter[data-v-acc9a86e],.tags-list-leave-to[data-v-acc9a86e]{opacity:0}
.suggest-pane[data-v-f2c085e8]{border-radius:.2rem;list-style:none;margin:0;outline:none;padding:0;width:100%}.suggest-pane-item[data-v-f2c085e8]{align-items:center;color:#fff;cursor:pointer;display:flex;font-size:.85rem;justify-content:flex-start;overflow:hidden;padding:.4rem 0;text-overflow:ellipsis;white-space:nowrap;width:100%}.suggest-pane-item[data-v-f2c085e8] span[data-v-f2c085e8]{padding-left:.4rem}.suggest-pane-item[data-v-f2c085e8].selected[data-v-f2c085e8],.suggest-pane-item[data-v-f2c085e8][data-v-f2c085e8]:hover{background:hsla(0,0%,100%,.2)}
.tags-main[data-v-54d3a52e]{align-items:center;border-radius:.2rem;display:flex;flex-wrap:wrap;justify-content:flex-start}.input-wrapper[data-v-54d3a52e]{align-self:center;height:100%;margin-top:.5rem;position:relative;width:200px}.suggestion-wrapper[data-v-54d3a52e]{filter:drop-shadow(2px 2px 10px rgba(0,0,0,.4));max-height:500px;min-height:400px;overflow-x:hidden;overflow-y:auto;position:absolute;top:2rem;width:100%;z-index:100}.suggestion-wrapper[data-v-54d3a52e].hidden[data-v-54d3a52e]{visibility:hidden}
.error {color:#b20000}

</style>